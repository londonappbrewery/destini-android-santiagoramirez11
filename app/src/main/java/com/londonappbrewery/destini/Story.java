package com.londonappbrewery.destini;

public class Story {
    private int idStoryTextView;
    private int idAnswer1;
    private int idAnswer2;
    Story nextStory1;
    Story nextStory2;

    public Story(int idStoryTextView, int idAnswer1, int idAnswer2, Story nextStory1, Story nextStory2) {
        this.idStoryTextView = idStoryTextView;
        this.idAnswer1 = idAnswer1;
        this.idAnswer2 = idAnswer2;
        this.nextStory1 = nextStory1;
        this.nextStory2 = nextStory2;
    }

    public int getIdStoryTextView() {
        return idStoryTextView;
    }

    public void setIdStoryTextView(int idStoryTextView) {
        this.idStoryTextView = idStoryTextView;
    }

    public int getIdAnswer1() {
        return idAnswer1;
    }

    public void setIdAnswer1(int idAnswer1) {
        this.idAnswer1 = idAnswer1;
    }

    public int getIdAnswer2() {
        return idAnswer2;
    }

    public void setIdAnswer2(int idAnswer2) {
        this.idAnswer2 = idAnswer2;
    }

    public Story getNextStory1() {
        return nextStory1;
    }

    public void setNextStory1(Story nextStory1) {
        this.nextStory1 = nextStory1;
    }

    public Story getNextStory2() {
        return nextStory2;
    }

    public void setNextStory2(Story nextStory2) {
        this.nextStory2 = nextStory2;
    }
}
