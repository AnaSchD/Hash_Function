import java.util.*;

public class PassportCollection {

    private Set<Passport> passportSet = new HashSet<>();


    public void addPassportInCollection(Passport passport) {
        if (!passportSet.isEmpty()) {
            for (Passport pas : passportSet) {
                if (pas.equals(passport)) {
                    throw new IllegalArgumentException("Паспорт с таким номером уже существует!");
                } else {
                   passportSet.add(passport);
                   break;
                }
            }
        } else {
            passportSet.add(passport);
        }
    }


        public Passport searchPassport (int numberPassport) {
            for (Passport pas : passportSet) {
                if (pas.getNumberPassport() == numberPassport) {
                    return pas;
                } else {
                    return null;
                }
            }
            return null;
        }



        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PassportCollection that = (PassportCollection) o;
            return Objects.equals(passportSet, that.passportSet);
        }

        @Override
        public int hashCode () {
            return Objects.hash(passportSet);
        }

    @Override
    public String toString() {
        return "PassportCollection{" +
                "passportSet=" + passportSet +
                '}';
    }
}


