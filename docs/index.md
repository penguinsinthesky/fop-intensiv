# Aufgaben Intensivbetreuung

## I1: Variablen

### a)

Erstellen Sie eine Variable `number`, die eine ganze Zahl speichern kann.
Initialisieren Sie diese mit dem Ausdruck $3 \cdot \left(4 - 2\right)$.
Erstellen Sie eine weitere Variable `text` des Typen `String` und initialisieren Sie mit der Zeichenkette,
die sich aus der Konkatenation von `"Das ist die Zahl: "` und `number` ergibt.
Geben sie die Zeichenkette auf der Konsole aus, die in `text` gespeichert ist.

### b)

Betrachten Sie das folgende Code-Beispiel. Welche Fehler werden bei der Übersetzung entstehen?

```java
int number = "5";
number = number + 1;
String numberText = number;
System.out.println(numberText);
```

### c)

Markieren Sie in dem folgenden Code, wo auf die Variablen `x` und `message` zugegriffen werden kann.

```java
int x = 10 / 2;

if (x > 2) {
	String message = "x ist größer als 2!"
	System.out.println(message);
}

System.out.println("x = " + x);
```

### d)

## I2: Programmfluss

### a)

Gegeben sei der Integer `age`, in dem das Alter einer Person gespeichert ist. Schreiben Sie eine `if-else`-Anweisung, die überprüft, ob die Person volljährig ist.
Wenn sie volljährig ist, soll `"Du bist volljährig"` auf der Konsole ausgegeben werden. Ansonsten soll ausgegeben werden, wie viele Jahre noch zur Volljährigkeit fehlen.

### b)

Berechnen Sie die Summe $\sum_{i=0}^{42} 2i$ mit einer `for`-Schleife und geben Sie sie auf der Konsole aus.
Zur Kontrolle: Das Ergebnis soll $1806$ sein.

### c)

Wir simulieren einen Raketenstart und wollen einen Countdown auf der Konsole ausgeben, der von $10$ bis $1$ in Sekunden herunter zählt und anschließend `"Start"` ausgibt.
Um eine Sekunde zu warten, verwenden Sie die Anweisung `waitSecond();`.

### d)

Schreiben Sie ein Programm, das alle geraden Zahlen in $[0, 100]$ aufsummiert. Sie dürfen hierfür keine `if`-Anweisung verwenden.
Zur Kontrolle: Das Ergebnis soll $2550$ sein.

### e)

Schreiben sie einen Algorithmus, der überprüft, ob ein `int`-Array Duplikate enthält.
Wenn ein Duplikat gefunden wird, sollen beide Indizes ausgegeben werden, an denen das gleiche Element ist.

### f)

Programmieren Sie eine Passwortüberprüfung. Das Programm fragt einen Nutzer so lange auf der Konsole nach einer Eingabe, bis er das Richtige Passwort in die Konsole eingegeben hat.
Nachdem das richtige Passwort eingegeben wurde, gibt das Programm eine positive Nachricht aus und terminiert.
Nutzen Sie zum einlesen einer Konsolen-Zeile `readLine();`. Überlegen Sie sich, welcher Schleifentyp hier besonders elegant ist!

## I3: FOPBot

### a)

Sei `bob` ein `Robot`. Bob hat eine gewisse Anzahl Münzen, die er ablegen will.
Schreiben sie eine `while`-Schleife, in der Bob *so lange* eine Münze ablegt, wie er noch Münzen hat.

### b)

Schreiben Sie ein Programm, das mit einem Roboter aus Münzen eine Treppe legt (siehe Abbildung).
Der Roboter befindet sich zu Beginn bei Position $(0, 0)$ und schaut nach rechts.
Sie dürfen davon ausgehen, dass der Roboter genügend Münzen hat.

![Treppen](assets/Stairs.png)

### c)

Sei `robot` ein Roboter. Drehen Sie den Roboter so lange, bis er nach oben schaut.
Nach jeder Drehung warten Sie eine Sekunde, in dem Sie `waitSecond();` aufrufen.

Anschließend soll sich der Roboter einmal um seine eigene Achse drehen. Nach jeder Drehung soll er wieder eine Sekunde warten.

Zuletzt soll der Roboter sich so lange im Kreis drehen und Münzen ablegen (siehe Abbildung), bis er keine Münzen mehr hat.
Dafür soll der Roboter sich *erst* bewegen und *danach* überprüfen, ob er noch Münzen hat.
Überlegen Sie sich, welcher Schleifentyp hier besonders gut geeignet ist.

![Kreis](assets/Circle.png)
