package com.ict.ryokon.shugakuryokon2018.databinding;
import com.ict.ryokon.shugakuryokon2018.R;
import com.ict.ryokon.shugakuryokon2018.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRollCallBindingImpl extends FragmentRollCallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.attend_num, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView3;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRollCallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentRollCallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.unattendNum.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.fabOnClick == variableId) {
            setFabOnClick((android.view.View.OnClickListener) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.ict.ryokon.shugakuryokon2018.ui.rollcall.view.RollCallAdapter) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.ict.ryokon.shugakuryokon2018.ui.rollcall.RollCallViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFabOnClick(@Nullable android.view.View.OnClickListener FabOnClick) {
        this.mFabOnClick = FabOnClick;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.fabOnClick);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.ict.ryokon.shugakuryokon2018.ui.rollcall.view.RollCallAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.ict.ryokon.shugakuryokon2018.ui.rollcall.RollCallViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelStartRollCall((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewmodelUserDataListText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelCompletedRollCall((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewmodelUnAttendNumText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelStartRollCall(androidx.databinding.ObservableBoolean ViewmodelStartRollCall, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelUserDataListText(androidx.databinding.ObservableField<java.lang.String> ViewmodelUserDataListText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCompletedRollCall(androidx.databinding.ObservableBoolean ViewmodelCompletedRollCall, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelUnAttendNumText(androidx.databinding.ObservableField<java.lang.String> ViewmodelUnAttendNumText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        androidx.databinding.ObservableBoolean viewmodelStartRollCall = null;
        boolean viewmodelCompletedRollCallGet = false;
        boolean viewmodelStartRollCallGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelUserDataListText = null;
        androidx.databinding.ObservableBoolean viewmodelCompletedRollCall = null;
        android.view.View.OnClickListener fabOnClick = mFabOnClick;
        androidx.databinding.ObservableField<java.lang.String> viewmodelUnAttendNumText = null;
        java.lang.String viewmodelUserDataListTextGet = null;
        int viewmodelCompletedRollCallUnattendNumAndroidColorColorZeroUserTextUnattendNumAndroidColorColorUnAttendText = 0;
        com.ict.ryokon.shugakuryokon2018.ui.rollcall.view.RollCallAdapter adapter = mAdapter;
        android.graphics.drawable.Drawable viewmodelStartRollCallMboundView3AndroidDrawableIcPauseWhite48dpMboundView3AndroidDrawableIcPlayArrowWhite48dp = null;
        java.lang.String viewmodelUnAttendNumTextGet = null;
        com.ict.ryokon.shugakuryokon2018.ui.rollcall.RollCallViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xcfL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.startRollCall
                        viewmodelStartRollCall = viewmodel.isStartRollCall();
                    }
                    updateRegistration(0, viewmodelStartRollCall);


                    if (viewmodelStartRollCall != null) {
                        // read viewmodel.startRollCall.get()
                        viewmodelStartRollCallGet = viewmodelStartRollCall.get();
                    }
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewmodelStartRollCallGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read viewmodel.startRollCall.get() ? @android:drawable/ic_pause_white_48dp : @android:drawable/ic_play_arrow_white_48dp
                    viewmodelStartRollCallMboundView3AndroidDrawableIcPauseWhite48dpMboundView3AndroidDrawableIcPlayArrowWhite48dp = ((viewmodelStartRollCallGet) ? (getDrawableFromResource(mboundView3, R.drawable.ic_pause_white_48dp)) : (getDrawableFromResource(mboundView3, R.drawable.ic_play_arrow_white_48dp)));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.userDataListText
                        viewmodelUserDataListText = viewmodel.getUserDataListText();
                    }
                    updateRegistration(1, viewmodelUserDataListText);


                    if (viewmodelUserDataListText != null) {
                        // read viewmodel.userDataListText.get()
                        viewmodelUserDataListTextGet = viewmodelUserDataListText.get();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.completedRollCall
                        viewmodelCompletedRollCall = viewmodel.getCompletedRollCall();
                    }
                    updateRegistration(2, viewmodelCompletedRollCall);


                    if (viewmodelCompletedRollCall != null) {
                        // read viewmodel.completedRollCall.get()
                        viewmodelCompletedRollCallGet = viewmodelCompletedRollCall.get();
                    }
                if((dirtyFlags & 0xc4L) != 0) {
                    if(viewmodelCompletedRollCallGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read viewmodel.completedRollCall.get() ? @android:color/colorZeroUserText : @android:color/colorUnAttendText
                    viewmodelCompletedRollCallUnattendNumAndroidColorColorZeroUserTextUnattendNumAndroidColorColorUnAttendText = ((viewmodelCompletedRollCallGet) ? (getColorFromResource(unattendNum, R.color.colorZeroUserText)) : (getColorFromResource(unattendNum, R.color.colorUnAttendText)));
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.unAttendNumText
                        viewmodelUnAttendNumText = viewmodel.getUnAttendNumText();
                    }
                    updateRegistration(3, viewmodelUnAttendNumText);


                    if (viewmodelUnAttendNumText != null) {
                        // read viewmodel.unAttendNumText.get()
                        viewmodelUnAttendNumTextGet = viewmodelUnAttendNumText.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewmodelUserDataListTextGet);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView3, viewmodelStartRollCallMboundView3AndroidDrawableIcPauseWhite48dpMboundView3AndroidDrawableIcPlayArrowWhite48dp);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(fabOnClick);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.mboundView4.setAdapter(adapter);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unattendNum, viewmodelUnAttendNumTextGet);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.unattendNum.setTextColor(viewmodelCompletedRollCallUnattendNumAndroidColorColorZeroUserTextUnattendNumAndroidColorColorUnAttendText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.startRollCall
        flag 1 (0x2L): viewmodel.userDataListText
        flag 2 (0x3L): viewmodel.completedRollCall
        flag 3 (0x4L): viewmodel.unAttendNumText
        flag 4 (0x5L): fabOnClick
        flag 5 (0x6L): adapter
        flag 6 (0x7L): viewmodel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewmodel.completedRollCall.get() ? @android:color/colorZeroUserText : @android:color/colorUnAttendText
        flag 9 (0xaL): viewmodel.completedRollCall.get() ? @android:color/colorZeroUserText : @android:color/colorUnAttendText
        flag 10 (0xbL): viewmodel.startRollCall.get() ? @android:drawable/ic_pause_white_48dp : @android:drawable/ic_play_arrow_white_48dp
        flag 11 (0xcL): viewmodel.startRollCall.get() ? @android:drawable/ic_pause_white_48dp : @android:drawable/ic_play_arrow_white_48dp
    flag mapping end*/
    //end
}