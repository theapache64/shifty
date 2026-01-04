import io.github.theapache64.korduino.core.*

const val SHIFT_UP_PIN = 34
const val BUZZER_PIN = 5

fun setup() {
    Serial.begin(115200)
    println("QuickTag: :setup: initializing...")
    pinMode(BUZZER_PIN, PinMode.OUTPUT)
}

fun loop() {
    val shiftUpRawValue = analogRead(SHIFT_UP_PIN)
    println("QuickTag: :loop: shiftUp value is $shiftUpRawValue |")

    if (shiftUpRawValue > 200) {
        beep()
    }
    delay(200)
}

fun beep() {
    digitalWrite(BUZZER_PIN, Digital.HIGH)
    delay(200)
    digitalWrite(BUZZER_PIN, Digital.LOW)
}