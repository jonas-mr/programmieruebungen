Ein **Radio** hat einen Power-Status, der signalisiert, ob das Radio ein- oder ausgeschaltet ist.
Außerdem eine Frequenz, die sich nur im erlaubten Frequenzbereich zwischen 85.0 und 110.0 befinden darf.
Und einen Lautstärkeregler, der die Lautstärke auf einer Skala von 1 bis 30 einstellt.
Radios können auch Sender speichern, sofern diese im erlaubten Frequenzbereich liegen, andernfalls wird eine **FrequencyNotAllowed** Fehlermeldung geworfen.

Zusätzlich gibt es auch **Bluetooth-Radios**.
Hier kommt ein weiterer Abspielmodus hinzu, der angibt, ob gerade über Bluetooth oder Radiowelle empfangen wird.
Außerdem muss für den Bluetooth-Modus auch das gekoppelte Gerät gespeichert werden.
Wenn kein gekoppeltes Gerät gefunden wird, schaltet das Bluetooth-Radio automatisch in den Radiomodus.

_Aufgabe_: Modelliere den Sachverhalt in einem UML-Diagram. Überführe dieses anschließend in Java und implementiere die beschriebenen Funktionen.