# Head First Design Patterns

## 개요
Practice and description design patterns using Java
## 목차
### 객체지향 원칙
### 1. Strategy Pattern
### 2. Observer Pattern
### 3. Decorator Pattern
### 4. Factory pattern
***
### 객체지향 원칙
-	바뀌는 부분은 캡슐화한다.
-	상속보다는 구성을 활용한다.
-	구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
-	서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
-	클래스는 확장에 대해서는 열려 있지만 변경에 대해서는 닫혀 있어야 한다.
-	추상화된 것에 의존하라. 구상 클래스에 의존하지 않도록 한다.
***
### 1. Strategy Pattern
##### 스트래티지 패턴
스트래티지 패턴에서는 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
##### 디자인 원칙
애플리케이션에서 달라지는 부분을 찾아내고 달라지지 않는 부분으로부터 분리시킨다.  
바뀌는 부분은 따로 뽑아서 캡슐화시킨다. 그렇게 하면 나중에 바뀌지 않는 부분에는 영향을 미치지 않은 채로 그 부분만 고치거나 확장할 수 있다.  
상속보다는 구성을 이용한다.   
구현이 아닌 인터페이스(상위형식)에 맞춰서 프로그래밍한다.
*	구현에 맞춰서 프로그래밍 (X)  
 Dog d = new Dog(); 
d.bark();
*	인터페이스/상위형식에 맞춰서 프로그래밍 (Δ)  
 Animal animal = new Dog(); 
animal.makeSound();
*	구체적으로 구현된 객체를 실행시에 대입 (O)  
 a = getAnimal();
 a.makeSound();
##### 객체지향의 기초
추상화  
캡슐화  
다형성  
상속
##### 객체지향 원칙
바뀌는 부분은 캡슐화한다.  
상속보다는 구성을 활용한다.  
구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.


