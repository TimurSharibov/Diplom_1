# ������ �� ������������ ���� ������ � ������������ ����� ������������

## �������� �������

������ ������ ������������ ����� ����� ������ ��� �������� ������ ������ `Database` � ������������ `IngredientType`. � ������� ����������� ����� �� JUnit, ������� ��������� ������������ ������ ������� � ������������ �������� ������������.

## ��������� �������

- `Database` - �����, �������������� ���� ������ ������� � ������������ ��� �������� ��������.
- `IngredientType` - ������������, ���������� ���� ������������ (���� � �������).

## �����

### ����� ��� ������ `Database`

����� ��� ������ `Database` ��������� ������������ ������ �������, ��������������� ������ � ������� ������� � ������������.

- **����� ������� `availableBuns` � `availableIngredients`**:
    - ���������, ��� ������ ���������� ���������� ������ ��������.
    - ���������, ��� ������ ������� �������� ���������� ��������.
    - ���������, ��� ������ ������������ �������� ���������� ��������.

### ����� ��� ������������ `IngredientType`

����� ��� ������������ `IngredientType` ��������� ������� � ������������ ����������� ����� ������������.

- **����� ������������ `IngredientType`**:
    - ��������� ������� ����� `SAUCE` � `FILLING`.
    - ��������� ������������ ����� � ����������� ������ ������� ����.
    - ���������, ��� ������������ �������� ����� ��� ��������.

## ��������� � ������

### ����������

- Java 11+
- Maven 3.6+
- JUnit 4

### ���������

1. ����������� �����������:
   ```bash
   git clone <URL ������ �����������>
2. ��������� � ���������� �������:
cd <�������� �������>
3. ������������� ������ � ��������� �����:
mvn clean test

### ������ ������ � IntelliJ IDEA
1. �������� ������ � IntelliJ IDEA.
2. ������� ������ ������� ���� �� ���������� src/test/java � �������� Run 'All Tests'.

### �����
���� ������ ��� ���������� � ������ �������� �� ��������� ������.���������.

### ���������:

1. **�������� �������**: ������ ��������� ���� � ���������� �������.
2. **��������� �������**: ��������� �������� ���������� �������.
3. **�����**: ������� ��� ������ ������ `Database` � ������������ `IngredientType`.
4. **��������� � ������**: ��������� ���� ��� ��������� � ������� ������� � ������.
5. **�����**: ��������� ������ � ��������������� ���������.
6. **��������**: ��������� �� �������� �������.

���� ���� `README.md` ������� ������������� � ������������� ������ ������, ��� ������������ ��� ������ � ����� ��� �������� ����������.








