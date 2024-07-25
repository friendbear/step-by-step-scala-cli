# [Commands/Basics](https://scala-cli.virtuslab.org/docs/commands/basics)

```bash
scala-cli Hello.scala
```

## Source files

```bash
scala-cli Hello.scala Message.scala
```

## Directories

```bash
scala-cli .
```

## URLs

```bash
scala-cli https://gist.github.com/alexarchambault/f972d941bc4a502d70267cfbbc4d6343/raw/2691c01984c9249936a625a42e29a822a357b0f6/Test.scala
```

## Piping

* scriptts

```bash
echo 'println("Hello") | scala-cli _.sc
```

* Scala code

```bash
echo @main def hello() = println("Hello") | scala-cli _.scala
```


* Java code

```bash
echo 'class Hello { public static void main(String args[]) { System.out.println("Hello"); } }' | scala-cli _.java
```


## Process substitution

```bash
scala-cli <(echo 'println("Hello")')
```

## Logging

scala-cli option -q


