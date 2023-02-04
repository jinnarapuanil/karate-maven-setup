package examples.users;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }
    @Karate.Test
    Karate testUsers1() {
        return Karate.run("soap").relativeTo(getClass());
    }
}
