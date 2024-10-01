package com.example.reading.presentation.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/example/reading/presentation/view/base/BaseView;", "", "bindView", "", "initializeComponent", "initializeData", "initializeEvents", "initializeView", "app_debug"})
public abstract interface BaseView {
    
    public abstract void initializeView();
    
    public abstract void initializeComponent();
    
    public abstract void initializeEvents();
    
    public abstract void initializeData();
    
    public abstract void bindView();
}