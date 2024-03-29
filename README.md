# Лабораторная работа #1
1. Для указанной функции провести модульное тестирование разложения функции в степенной ряд. Выбрать достаточное тестовое покрытие.
2. Провести модульное тестирование указанного алгоритма. Для этого выбрать характерные точки внутри алгоритма, и для предложенных самостоятельно наборов исходных данных записать последовательность попадания в характерные точки. Сравнить последовательность попадания с эталонной.
3. Сформировать доменную модель для заданного текста.  Разработать тестовое покрытие для данной доменной модели

**Вариант**: 235724
1. Функция tg(x)
2. Программный модуль для работы с автоматически регулируемой кучей (http://www.cs.usfca.edu/~galles/visualization/SkewHeap.html)
3. Описание предметной области:
```
Артур неожиданно почувствовал, как на его бесплотной голове зашевелились волосы, когда он начал медленно, но неуклонно двигаться к пульту, но это был всего лишь, как он тут же догадался, наезд камеры при съемке.
```

## Компоненты

- `Tan.java` и `TanTest.java` - модуль и тесты для аппроксимации функции тангенс.
- `SkewHeap.java` и `SkewHeapTest.java` - реализация и тестирование структуры данных Skew Heap.
- `Arthur.java`, `Camera.java`, `Console.java` и `SimulationTest.java` - симуляция сценария с персонажем, камерой и пультом, а также тесты для этой симуляции.

## Основные операции

1. Аппроксимация функции тангенс: `Tan.tanApprox(double x)`.
2. Операции с Skew Heap: `SkewHeap.insert(int value)`, `SkewHeap.removeMin()`, `SkewHeap.merge(SkewHeap other)`.
3. Симуляция сценария съемок: `Arthur.reactToCamera()`, `Arthur.moveToConsole()`, `Camera.turnOn()`, `Console.activate()`.

### Доменная модель:
1. **Персонаж** `Arthur`:
   - Свойства: `position` (положение), `feeling` (ощущения).
   - Методы: `moveToConsole()` (движение к пульту), `reactToCamera()` (реакция на камеру).

2. **Камера** `Camera`:
   - Свойства: `status` (статус).
   - Методы: `turnOn()` (включение).

3. **Пульт** `Console`:
   - Свойства: `status` (статус).
   - Методы: `activate()` (активация).

### Тестовое покрытие:

1. **Тест реакции Артура на камеру**:
   - Проверить, что после воздействия камеры свойство `feeling` Артура содержит ожидаемое описание его ощущений.

2. **Тест движения Артура к пульту**:
   - Проверить, что после вызова метода `moveToConsole()` положение Артура (`position`) изменяется ожидаемым образом.
   - Проверить, что свойство `feeling` Артура обновляется соответствующим образом.

3. **Тест включения камеры**:
   - Проверить, что после вызова метода `turnOn()` у камеры её статус изменяется на "recording".

4. **Тест активации пульта**:
   - Проверить, что после вызова метода `activate()` у пульта его статус изменяется на "active".

## Авторы
- Студент: [Новиков Егор Сергеевич | Исупов Денис Васильевич]
- Преподаватель: [Имя Преподавателя]
