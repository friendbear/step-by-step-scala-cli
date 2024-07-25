# [Commands/Compile](https://scala-cli.virtuslab.org/docs/commands/compile)

```bash
scala-cli compile Hello.scala
```

## Test scope

```bash
scala-cli compile --test Sample.test.scala
```

## Watch mode

```bash
scala-cli compile --watch Hello.scala
```

## Scala version

```bash
scala-cli compile --scala 2.13.6 Hello.scala
```

```bash
scala-cli compile --scala 2.12 Hello.scala
scala-cli compile --scala 2 Hello.scala
scala-cli compile --scala 3 Hello.scala
```

## Scala Nightlies

For compiling with the latest Scala 2 nightly build:

`scala-cli Hello.scala -S 2.nightly`

For compiling with the latest Scala 3 nightly build:

`scala-cli Hello.scala -S 3.nightly`

For compiling with a specific nightly build you have the full version:


`scala-cli Hello.scala -S 2.13.9-bin-4505094`

For setting this inside scala files, use using directives:

```text
//> using scala 2.nightly

//> using scala 3.nightly

//> using scala 2.13.9-bin-4505094
```

## Dependencies

```bash
scala-cli compile Hello.scala \
    --dependency org.scala-lang.modules::scala-parallel-collections:1.0.4
```


```bash
scala-cli compile Hello.scala --jar /path/to/library.jar
```

## Scala compiler option

```bash
scala-cli compile Hello.scala -O -deprecation -O -Xlint::infer-any
```

## Passing compiler options with using directives

It is also possible to pass compiler options with the appropriate using directives.

A single option can be passed like this:

```scala
//> using option -new-syntax
@main def hello = if true then println("Hello")
```

It's also possible to pass a value to the option with the same directive:

```scala
//> using option -release 11

import java.net.http.HttpRequest
```

There's a separate directive for passing multiple options at one time:

```scala
//> using options -new-syntax -rewrite -source:3.2-migration

@main def hello = if (true) println("Hello")
```

## Compile-Only Dependencies

