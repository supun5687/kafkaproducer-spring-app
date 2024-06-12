# kafka local installation guide
server.properties file
----------------------------
log.dirs=D:/BigDataLocalSetup/tmp/kafka-logs

zookeeper.properties file
---------------------------
dataDir=D:/BigDataLocalSetup/tmp/zookeeper

start zookeeper
------------------------
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

start kafka
------------------------------------
.\bin\windows\kafka-server-start.bat .\config\server.properties


create a topic
---------------------

.\bin\windows\kafka-topics.bat --create --topic test_topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

verify topic creation
----------------------------

.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

produce messages
--------------------------

.\bin\windows\kafka-console-producer.bat --topic test_topic --bootstrap-server localhost:9092


consume messages
------------------------

.\bin\windows\kafka-console-consumer.bat --topic test_topic --from-beginning --bootstrap-server localhost:9092
