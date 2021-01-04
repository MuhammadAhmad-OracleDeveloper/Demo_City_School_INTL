package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 18 22:52:46 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblLookupDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        LookupMasterId,
        Name,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblEvalWeightage,
        TblLookupDetailD,
        TblLookupMaster,
        TblStaff,
        TblStaff1,
        TblStaff2,
        TblStaff3,
        TblStaff4,
        TblStaffBenefit,
        TblStaffPassport,
        TblStaffRole,
        TblStaffVisa,
        TblStaffVisa1,
        TblStdEnq,
        TblStdReg,
        TblStdReg1,
        TblStdReg2,
        TblStdReg3,
        TblStdReg4,
        TblStdReg5,
        TblStdReg6,
        TblStdReg7;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ID = AttributesEnum.Id.index();
    public static final int LOOKUPMASTERID = AttributesEnum.LookupMasterId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLEVALWEIGHTAGE = AttributesEnum.TblEvalWeightage.index();
    public static final int TBLLOOKUPDETAILD = AttributesEnum.TblLookupDetailD.index();
    public static final int TBLLOOKUPMASTER = AttributesEnum.TblLookupMaster.index();
    public static final int TBLSTAFF = AttributesEnum.TblStaff.index();
    public static final int TBLSTAFF1 = AttributesEnum.TblStaff1.index();
    public static final int TBLSTAFF2 = AttributesEnum.TblStaff2.index();
    public static final int TBLSTAFF3 = AttributesEnum.TblStaff3.index();
    public static final int TBLSTAFF4 = AttributesEnum.TblStaff4.index();
    public static final int TBLSTAFFBENEFIT = AttributesEnum.TblStaffBenefit.index();
    public static final int TBLSTAFFPASSPORT = AttributesEnum.TblStaffPassport.index();
    public static final int TBLSTAFFROLE = AttributesEnum.TblStaffRole.index();
    public static final int TBLSTAFFVISA = AttributesEnum.TblStaffVisa.index();
    public static final int TBLSTAFFVISA1 = AttributesEnum.TblStaffVisa1.index();
    public static final int TBLSTDENQ = AttributesEnum.TblStdEnq.index();
    public static final int TBLSTDREG = AttributesEnum.TblStdReg.index();
    public static final int TBLSTDREG1 = AttributesEnum.TblStdReg1.index();
    public static final int TBLSTDREG2 = AttributesEnum.TblStdReg2.index();
    public static final int TBLSTDREG3 = AttributesEnum.TblStdReg3.index();
    public static final int TBLSTDREG4 = AttributesEnum.TblStdReg4.index();
    public static final int TBLSTDREG5 = AttributesEnum.TblStdReg5.index();
    public static final int TBLSTDREG6 = AttributesEnum.TblStdReg6.index();
    public static final int TBLSTDREG7 = AttributesEnum.TblStdReg7.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblLookupDetailImpl() {
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for LookupMasterId, using the alias name LookupMasterId.
     * @return the value of LookupMasterId
     */
    public BigDecimal getLookupMasterId() {
        return (BigDecimal) getAttributeInternal(LOOKUPMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LookupMasterId.
     * @param value value to set the LookupMasterId
     */
    public void setLookupMasterId(BigDecimal value) {
        setAttributeInternal(LOOKUPMASTERID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblEvalWeightage() {
        return (RowIterator) getAttributeInternal(TBLEVALWEIGHTAGE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblLookupDetailD() {
        return (RowIterator) getAttributeInternal(TBLLOOKUPDETAILD);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblLookupMaster() {
        return (EntityImpl) getAttributeInternal(TBLLOOKUPMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblLookupMaster(EntityImpl value) {
        setAttributeInternal(TBLLOOKUPMASTER, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaff() {
        return (RowIterator) getAttributeInternal(TBLSTAFF);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaff1() {
        return (RowIterator) getAttributeInternal(TBLSTAFF1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaff2() {
        return (RowIterator) getAttributeInternal(TBLSTAFF2);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaff3() {
        return (RowIterator) getAttributeInternal(TBLSTAFF3);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaff4() {
        return (RowIterator) getAttributeInternal(TBLSTAFF4);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffBenefit() {
        return (RowIterator) getAttributeInternal(TBLSTAFFBENEFIT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffPassport() {
        return (RowIterator) getAttributeInternal(TBLSTAFFPASSPORT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffRole() {
        return (RowIterator) getAttributeInternal(TBLSTAFFROLE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffVisa() {
        return (RowIterator) getAttributeInternal(TBLSTAFFVISA);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStaffVisa1() {
        return (RowIterator) getAttributeInternal(TBLSTAFFVISA1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdEnq() {
        return (RowIterator) getAttributeInternal(TBLSTDENQ);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg() {
        return (RowIterator) getAttributeInternal(TBLSTDREG);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg1() {
        return (RowIterator) getAttributeInternal(TBLSTDREG1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg2() {
        return (RowIterator) getAttributeInternal(TBLSTDREG2);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg3() {
        return (RowIterator) getAttributeInternal(TBLSTDREG3);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg4() {
        return (RowIterator) getAttributeInternal(TBLSTDREG4);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg5() {
        return (RowIterator) getAttributeInternal(TBLSTDREG5);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg6() {
        return (RowIterator) getAttributeInternal(TBLSTDREG6);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblStdReg7() {
        return (RowIterator) getAttributeInternal(TBLSTDREG7);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblLookupDetail");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
         try {
             loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
             } else if(operation == DML_UPDATE) {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

