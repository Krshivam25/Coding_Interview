import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private class person {
        String name;
        List<Person> calls;

        private person(String name) {
            this.name = name;
            calls = new ArrayList<>();
        }
    }

    public boolean canImeet(person p1, person p2) {
        Queue<person> nextToAsk = new LinkedList<>();
        Set<person> asked = new HashSet<>();
        nextToAsk.add(p1);
        asked.add(p1);

        while (!nextToAsk.isEmpty()) {
            person needy = nextToAsk.remove();

            if (needy == p2) {
                return true;
            }
            asked.add(needy);

            for (person booty : needy.calls) {
                if (!asked.contains(booty)) {
                    nextToAsk.add(booty);
                }
            }
        }
        return false;

    }
}
