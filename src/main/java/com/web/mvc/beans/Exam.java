package com.web.mvc.beans;

import java.util.Arrays;

public class Exam {
    private String id;
    private String exam;
    private String[] slot;
    private String pay;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String[] getSlot() {
        return slot;
    }

    public void setSlot(String[] slot) {
        this.slot = slot;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + id + ", exam=" + exam + ", slot=" + Arrays.toString(slot) + ", pay=" + pay + ", note=" + note + '}';
    }
    
    
}
