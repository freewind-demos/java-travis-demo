Java Travis-CI Demo
===================

A Java project with travis-CI demo.

See definitions in `.travis.yml`, and more in <https://docs.travis-ci.com/user/languages/java/>

We don't need to specify settings for maven project, since travis will run it by default with:

Travis uses `openjdk8` for default.

```
mvn test -B
```

Status: ![CI](https://travis-ci.org/java-demos/java-travis-demo.svg?branch=master)
