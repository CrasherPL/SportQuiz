package com.example.sportquiz;

public class Questions {

    public String mQuestions[] = {
            "Która drużyna wygrała Mistrzostwa Świata w piłce nożnej w 2018 roku? ",
            "Kto został indywidualnym Mistrzem Świata na żużlu w 2019 roku",
            "Kto jest trenerem reprezentacji Polski w piłce nożnej",
            "Która z wymienionych siatkarek występuje na pozycji atakującej w reprezentacji kobiet?",
            "Która drużyna wygrała rozgrywki NBA w 2019 roku",
            "Ile medali zdobyli Polacy na osatnich Mistrzostwach Świata w Doha?",
            "Kto wygrał klasyfikacje generalną Pucharu Świata w skokach narciarskich w 2019 roku?",
            "W jakiej drużynie obecnie gra najlepszy strzelec reprezentacji Polski w piłce nożnej?",
            "Jaka drużyna wygrała rozgrywki LaLiga w sezonie 208/2019?",


    };

    private String mChoices [] [] = {
            {"Francja", "Anglia", "Hiszpania", "Portugalia"},
            {"Maciej Janowski", "Artiom Łaguta", "Tai Woffinden", "Bartosz Zmarzlik"},
            {"Adam Nawałka", "Jerzy Brzęczek", "Piotr Stokowiec", "Czesław Michniewicz "},
            {"Joanna Wołosz", "Maria Stenzel", "Agnieszka Kąkolewska", "Malwina Smarzek"},
            {"Los Angeles Lakers", "Cleveland Cavaliers", "Toronto Raptors", "Golden State Warriors"},
            {"2", "4", "6", "8"},
            {"Dawid Kubacki", "Ryoyu Kobayashi", "Karl Gieger", "Stefan Kraft"},
            {"Borussia Dortmund", "Juventus Turyn", "Real Madryt", "Bayern Monachium"},
            {"Sevilla FC", "Atletico Madryt", "FC Barcelona", "Real Madryt"},
            {"Odpowiedź 1", "Odpowiedź 2", "Odpowiedź 3", "Odpowiedź 4"},

    };

    private String mCorrectAnswers[] = {"Francja","Bartosz Zmarzlik", "Jerzy Brzęczek", "Malwina Smarzek" , "Toronto Raptors", "6", "Ryoyu Kobayashi", "Bayern Monachium" , "FC Barcelona", "Odpowiedź 2"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
