package android.example.com.apptrabalho1;

import android.os.Parcel;
import android.os.Parcelable;

public class Disciplina implements Parcelable {
    private Integer codigo;
    private String descricao;
    private Integer cargaHoraria;

    public Disciplina(Integer codigo, Integer cargaHoraria , String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }


    protected Disciplina(Parcel in) {
       codigo = in.readInt();
       descricao = in.readString();
       cargaHoraria = in.readInt();
    }

    public static final Parcelable.Creator<Disciplina> CREATOR = new Parcelable.Creator<Disciplina>() {
        @Override
        public Disciplina createFromParcel(Parcel in) {
            return new Disciplina(in);
        }

        @Override
        public Disciplina[] newArray(int size) {
            return new Disciplina[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(codigo);
        dest.writeString(descricao);
        dest.writeInt(cargaHoraria);
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double convertCargaToHora(){
        return Double.valueOf((this.cargaHoraria * 50)/60.0);
    }
}


