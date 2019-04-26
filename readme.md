
# Remote log to ELK via TCP appender

Start ELK stack, with config for TCP input:

```bash
docker run -p 5601:5601 -p 9200:9200 -p 5044:5044 -p 4560:4560 -it --rm -v $PWD/logstash-tcp-input.conf:/etc/logstash/conf.d/03-tcp-input.conf sebp/elk:670
```

Start the app:
```bash
mvn spring-boot:run
```

Create some message in browser:
```
http://localhost:8080/
```

Check ELK page for new log entries:
```
http://localhost:5601/app/kibana
```


