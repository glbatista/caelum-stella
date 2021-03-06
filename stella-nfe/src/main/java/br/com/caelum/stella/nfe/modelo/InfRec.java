/**
 * 
 */
package br.com.caelum.stella.nfe.modelo;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.vidageek.fluid.annotations.FluidName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfRec ", propOrder = { "nRec", "dhRecbto", "tMed" })
@FluidName("ReciboDoLote")
public class InfRec {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @FluidName("numeroDoRecibo")
    protected String nRec;

    @XmlElement(required = true)
    @FluidName("dataEHoraDoRecebimento")
    protected String dhRecbto;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @FluidName("tempoMedioDeResposta")
    protected String tMed;

    public String getNRec() {
        return nRec;
    }

    public void setNRec(final String value) {
        nRec = value;
    }

    public String getDhRecbto() {
        return dhRecbto;
    }

    public void setDhRecbto(final Calendar calendar) {
        dhRecbto = calendar.toString(); // TODO formatar isso
    }

    public String getTMed() {
        return tMed;
    }

    public void setTMed(final String value) {
        tMed = value;
    }

}