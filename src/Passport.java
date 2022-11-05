import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passport {

    private String name;
    private String surname;
    private String patronymic;
    private String dateOfBirth;
    private int numberPassport;

    public Passport(String name, String surname, String patronymic, String dateOfBirth, int numberPassport) {
        if (name == null && name.isEmpty() && name.isBlank()) {
            throw new RuntimeException("Имя указано неверно");
        } else {
            this.name = name;
        }
        if (surname == null && surname.isEmpty() && surname.isBlank()) {
            throw new RuntimeException("Фамилия указано неверно");
        } else {
            this.surname = surname;
        }
        if (patronymic == null && patronymic.isEmpty() && patronymic.isBlank()) {
            this.patronymic = "Нет отчества";
        } else {
            this.patronymic = patronymic;
        }
        if (dateOfBirth == null) {
            throw new RuntimeException("Введите дату рождения");
        } else {
            this.dateOfBirth = dateOfBirth;
        }

        if (numberPassport <= 0) {
            throw new RuntimeException("Номер паспорта некорректный!");
        } else {
            this.numberPassport = numberPassport;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    @Override
    public String toString() {
        return "Passport № " + numberPassport + " " + name + " " + surname + " " + patronymic + " " + dateOfBirth  + "\n" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberPassport == passport.numberPassport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }
}
