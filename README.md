# Fibonacci series


a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.


###### Program
```java
class Fibonacci
{
    public static void main(String args[])
    {
        byte limit = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci series ");
        System.out.println("The values are : ");
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i < limit; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
```
#### Compile java program

javac ClassName.java


#### Run java Program

java ClassName

### find Fibonacci
```java

    int a = 0;
    int b = 1;
    int c = 0;
for(int i = 0; i < limit; i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
```

### Response

>compile java program : javac Fibonacci.java

>run java program : java Fibonacci

```java
Fibonacci series 
The values are : 
0
1
1
2
3
5
8
13
21
34
55
89
```



