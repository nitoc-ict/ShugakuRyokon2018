package com.ict.ryokon.shugakuryokon2018.databinding;
import com.ict.ryokon.shugakuryokon2018.R;
import com.ict.ryokon.shugakuryokon2018.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowBeaconUserListBindingImpl extends RowBeaconUserListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowBeaconUserListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowBeaconUserListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.attendNumText.setTag(null);
        this.mainText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minorText.setTag(null);
        this.subText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.userdata == variableId) {
            setUserdata((com.ict.ryokon.shugakuryokon2018.model.UserData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserdata(@Nullable com.ict.ryokon.shugakuryokon2018.model.UserData Userdata) {
        this.mUserdata = Userdata;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userdata);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.ict.ryokon.shugakuryokon2018.model.AttendanceNumber userdataAttendanceNumber = null;
        java.lang.String userdataMinorValueToString = null;
        com.ict.ryokon.shugakuryokon2018.model.Minor userdataMinor = null;
        java.lang.Integer userdataAttendanceNumberValue = null;
        com.ict.ryokon.shugakuryokon2018.model.Name userdataName = null;
        com.ict.ryokon.shugakuryokon2018.model.UserData userdata = mUserdata;
        java.lang.String userdataNameKanji = null;
        java.lang.Integer userdataMinorValue = null;
        java.lang.String userdataAttendanceNumberValueToString = null;
        java.lang.String userdataNameHiragana = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userdata != null) {
                    // read userdata.attendanceNumber
                    userdataAttendanceNumber = userdata.getAttendanceNumber();
                    // read userdata.minor
                    userdataMinor = userdata.getMinor();
                    // read userdata.name
                    userdataName = userdata.getName();
                }


                if (userdataAttendanceNumber != null) {
                    // read userdata.attendanceNumber.value
                    userdataAttendanceNumberValue = userdataAttendanceNumber.getValue();
                }
                if (userdataMinor != null) {
                    // read userdata.minor.value
                    userdataMinorValue = userdataMinor.getValue();
                }
                if (userdataName != null) {
                    // read userdata.name.kanji
                    userdataNameKanji = userdataName.getKanji();
                    // read userdata.name.hiragana
                    userdataNameHiragana = userdataName.getHiragana();
                }


                if (userdataAttendanceNumberValue != null) {
                    // read userdata.attendanceNumber.value.toString()
                    userdataAttendanceNumberValueToString = userdataAttendanceNumberValue.toString();
                }
                if (userdataMinorValue != null) {
                    // read userdata.minor.value.toString()
                    userdataMinorValueToString = userdataMinorValue.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.attendNumText, userdataAttendanceNumberValueToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mainText, userdataNameKanji);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.minorText, userdataMinorValueToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subText, userdataNameHiragana);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userdata
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}