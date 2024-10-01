// Generated by view binder compiler. Do not edit!
package com.example.reading.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.reading.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogMessageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnOk;

  @NonNull
  public final ImageView imgStatus;

  @NonNull
  public final TextView txtContent;

  @NonNull
  public final TextView txtTitle;

  private DialogMessageBinding(@NonNull LinearLayout rootView, @NonNull TextView btnOk,
      @NonNull ImageView imgStatus, @NonNull TextView txtContent, @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.btnOk = btnOk;
    this.imgStatus = imgStatus;
    this.txtContent = txtContent;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnOk;
      TextView btnOk = ViewBindings.findChildViewById(rootView, id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.imgStatus;
      ImageView imgStatus = ViewBindings.findChildViewById(rootView, id);
      if (imgStatus == null) {
        break missingId;
      }

      id = R.id.txtContent;
      TextView txtContent = ViewBindings.findChildViewById(rootView, id);
      if (txtContent == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      TextView txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      return new DialogMessageBinding((LinearLayout) rootView, btnOk, imgStatus, txtContent,
          txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
