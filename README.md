# nicobot-persistence-api
Java Client to use the [nicobot-persistence](https://github.com/jlamby/nicobot-persistence) projet.


## supported java versions
Java 8 and later.

## use it with maven
Add this to your dependencies:

```xml
<dependency>
    <groupId>be.zqsd.nicobot</groupId>
    <artifactId>nicobot-persistence-api</artifactId>
    <version>1.0.2</version>
</dependency>
```

## call the endpoints

Initialize a client this way:

```java
NicobotPerstitence client = NicobotPersistence.create(apiUri, apiKey);
```

`apiUri` being the url where the api is exposed, and  
`apiKey` being the key used to call endpoints.

You can then use the client with the following methods:

```java
client.messageService().readMessages(...);
```

The client exposes 3 methods (currently)

```java
client.messageService()
client.hgtService()
client.gommetteService()
```

each method returns an interface. Check them to know which endpoint is implemented.