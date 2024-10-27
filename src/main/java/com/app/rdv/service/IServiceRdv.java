package com.app.rdv.service;

import com.app.rdv.entities.Rdv;

import java.util.Collection;
import java.util.List;

public interface IServiceRdv {
    public abstract Rdv addRdv(Rdv rdv);
    public abstract List<Rdv> getListRDV();
}

