# Tech Support Request Handler

## 🔗 Chain of Responsibility 

Симуляция цепочки поддержки:
- [FAQBot] → [JuniorSupport] → [SeniorSupport]

## 📂 Структура
- `handler/` — обработчики и базовый абстрактный класс
- `Main.java` — запуск цепочки

Запуск

```bash
javac src/handler/*.java src/Main.java
java -cp src Main
