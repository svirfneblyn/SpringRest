package service.rest.entity;

/**
 * Created by Ihar_Rubanovich on 3/17/2017.
 */

import javax.persistence.*;

@Entity
@Table(name = "stuff_hierarchy")
public class StaffHierarchy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Long manger_id;
    private Long subordinate_id;

    public StaffHierarchy() {
    }

    public StaffHierarchy(long id){
        this.id=id;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getManger_id() {
        return manger_id;
    }

    public void setManger_id(Long manger_id) {
        this.manger_id = manger_id;
    }

    public Long getSubordinate_id() {
        return subordinate_id;
    }

    public void setSubordinate_id(Long subordinate_id) {
        this.subordinate_id = subordinate_id;
    }

    @Override
    public String toString() {
        return "StaffHierarchy{" +
                "id=" + id +
                ", manger_id=" + manger_id +
                ", subordinate_id=" + subordinate_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaffHierarchy)) return false;

        StaffHierarchy that = (StaffHierarchy) o;

        if (getId() != that.getId()) return false;
        if (getManger_id() != null ? !getManger_id().equals(that.getManger_id()) : that.getManger_id() != null)
            return false;
        return getSubordinate_id() != null ? getSubordinate_id().equals(that.getSubordinate_id()) : that.getSubordinate_id() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getManger_id() != null ? getManger_id().hashCode() : 0);
        result = 31 * result + (getSubordinate_id() != null ? getSubordinate_id().hashCode() : 0);
        return result;
    }
}
