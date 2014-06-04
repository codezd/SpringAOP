package com.codezd;

/**
 * Created by codezd.com on 14-6-2.
 */
public class BraveKnight implements Knight {
   private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
