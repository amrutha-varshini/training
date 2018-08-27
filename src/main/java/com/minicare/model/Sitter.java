package com.minicare.model;

import java.util.Set;
public class Sitter extends Users
{
    private String title;
    private String desc;
    private Set<SeekerJob> job;

    public String getTitle()
    {
        return title;
    }

    public String getDesc()
    {
        return desc;
    }

    public Set<SeekerJob> getJob()
    {
        return job;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public void setJob(Set<SeekerJob> job)
    {
        this.job = job;
    }
}