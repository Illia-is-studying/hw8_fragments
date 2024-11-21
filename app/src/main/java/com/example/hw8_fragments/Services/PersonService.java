package com.example.hw8_fragments.Services;

import com.example.hw8_fragments.Models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private static final List<Person> persons;

    static {
        persons = new ArrayList<>();

        persons.add(new Person("Inga", new String[]{"12.01", "08.02", "24.11", "15.03"},
                "Inga is manipulative and conniving, often using others " +
                        "to her advantage. She is vindictive and holds grudges for a long time," +
                        " often losing her temper unexpectedly. " +
                        "Her inability to empathize makes her truly a psychopath. " +
                        "There is no work to think about, as she will either be behind bars or " +
                        "engaged in illegal activities. \n" +
                        "Usually love flowers and thinking activities."));
        persons.add(new Person("Bob", new String[]{"14.04", "10.06", "01.01", "23.09"},
                "Bob is quick-tempered and argumentative. He tends to prefer solitude and avoids social gatherings. He might only thrive in solitary roles."));
        persons.add(new Person("Charlie", new String[]{"02.05", "08.07", "13.10", "29.12"},
                "Charlie is indecisive and overly dependent on others. He prefers not to take risks or make decisions. He might be relegated to support roles where leadership isn't required."));
        persons.add(new Person("Diana", new String[]{"18.03", "21.06", "30.09", "24.12"},
                "Diana is overly critical and nitpicks everything. She avoids responsibility and passes blame to others. She would struggle in positions requiring accountability."));
        persons.add(new Person("Eve", new String[]{"11.01", "19.02", "25.11", "09.03"},
                "Eve is extremely lazy and avoids effort at all costs. She prefers to procrastinate and spends time doing nothing productive. Her career might involve repetitive, low-responsibility tasks."));
        persons.add(new Person("Frank", new String[]{"04.03", "07.08", "16.11", "21.12"},
                "Frank is rude and dismissive toward others. He prefers confrontation over cooperation. His best role might be one with minimal customer or team interaction."));
        persons.add(new Person("Grace", new String[]{"05.02", "14.07", "22.10", "31.12"},
                "Grace is disorganized and forgetful. She avoids planning and often arrives late. Any profession requiring precision or punctuality would likely be difficult for her."));
        persons.add(new Person("Hank", new String[]{"01.04", "09.05", "19.11", "13.06"},
                "Hank is stubborn and refuses to admit mistakes. He prefers to avoid feedback and learning new skills. His career might stagnate in roles that reward adaptability."));
        persons.add(new Person("Ivy", new String[]{"03.06", "12.07", "24.09", "28.12"},
                "Ivy is clumsy and careless, often breaking things. She avoids situations requiring careful attention. She may only succeed in roles with minimal physical or technical responsibility."));
        persons.add(new Person("Jack", new String[]{"17.02", "25.03", "02.12", "06.10"},
                "Jack is perpetually late and unreliable. He dislikes commitments and tends to leave tasks unfinished. His career might fit in highly flexible, low-pressure environments."));
        persons.add(new Person("Karen", new String[]{"19.01", "15.04", "12.10", "23.11"},
                "Karen is overly talkative and rarely listens to others. She prefers to dominate conversations and avoids collaboration. She might only thrive in solitary or highly independent roles."));
        persons.add(new Person("Leo", new String[]{"06.03", "20.08", "29.11", "08.12"},
                "Leo is manipulative and untrustworthy. He prefers to take shortcuts and often exploits others for personal gain. His career might lean toward high-risk or morally questionable roles."));
        persons.add(new Person("Mia", new String[]{"12.06", "03.09", "16.11", "27.12"},
                "Mia is indecisive and lacks confidence. She dislikes making choices and often doubts herself. Any profession requiring quick decision-making would overwhelm her."));
        persons.add(new Person("Noah", new String[]{"10.02", "07.05", "18.09", "11.12"},
                "Noah is overly sensitive and prone to mood swings. He avoids criticism and struggles under pressure. His career might suit low-stress environments."));
        persons.add(new Person("Olivia", new String[]{"25.03", "09.07", "30.11", "17.12"},
                "Olivia is uncooperative and hates teamwork. She prefers working alone and often isolates herself from peers. She might thrive only in roles requiring minimal collaboration."));
        persons.add(new Person("Paul", new String[]{"14.01", "22.06", "01.10", "20.11"},
                "Paul is easily angered and quick to lash out. He dislikes working under authority and often challenges rules. His career might suit independent or self-managed roles."));
    }

    public static Person getPersonByName(String name) {
        return persons.stream()
                .filter(p -> p.getName().equals(name))
                .collect(Collectors.toList())
                .get(0);
    }

    public static List<Person> getPersons() {
        return persons;
    }

    public static String[] getNames() {
        return persons.stream()
                .map(Person::getName)
                .toArray(String[]::new);
    }
}
