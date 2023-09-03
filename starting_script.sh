#install download wildfly-29.0.1.Final at https://www.wildfly.org/downloads/
echo "********* shutdown server **********"
#put here jboss-cli.sh directory (works only for versions with j-boss.cli (after 10 version as I know))
sh /work/learn/wildfly-29.0.1.Final/bin/jboss-cli.sh --connect controller=127.0.0.1:9990 command=:shutdown
echo "********* clean server temps **********"
# -r recursive
rm -rf /work/learn/wildfly-29.0.1.Final/standalone/tmp/
echo "********* Maven build **********"
#put here pom.xml directory
mvn clean install -f /work/learn/springeasy
echo "********* Clean deployments **********"
rm -rf work/learn/wildfly-29.0.1.Final/standalone/deployments/wb.war
echo "********* COPY builded files **********"
#   here  FROM     (target maven directory)
#         TO       wildfly deployments ditectory
cp /work/learn/springeasy/target/wb.war             /work/learn/wildfly-29.0.1.Final/standalone/deployments/wb.war
echo "********* Start server **********"
sh -f /work/learn/wildfly-29.0.1.Final/bin/standalone.sh
