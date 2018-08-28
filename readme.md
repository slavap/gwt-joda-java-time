## Java8 java.time emulation for GWT.

### How to use:

1) You have to load [js-joda](https://github.com/js-joda/js-joda) and [js-joda-timezone](https://github.com/js-joda/js-joda-timezone) in your index.html (or any other way).

```html
<script src="js/js-joda.min.js"></script>
<script src="js/js-joda-timezone.min.js"></script>
```

Also it's possible to use the same IANA timezone database for js-joda-timezone and moment.tz
```html
<script src="js/moment.min.js"></script>
<script src="js/moment-timezone.min.js"></script>
<script type="text/javascript">moment.tz.load(JSJoda.ZoneRulesProvider.getTzdbData());</script>
```

2) Add dependency to pom.xml:

```xml
<dependency>
  <groupId>com.vx.jtime</groupId>
  <artifactId>gwt-joda-java-time</artifactId>
  <version>0.0.1</version>
  <classifier>sources</classifier>
  <scope>provided</scope>
</dependency>
```

3) Add to yourProject.gwt.xml: 

```xml
<inherits name='com.vx.jtime.JTime' />
```
