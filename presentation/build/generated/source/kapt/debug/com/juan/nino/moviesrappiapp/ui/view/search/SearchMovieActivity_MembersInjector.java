// Generated by Dagger (https://google.github.io/dagger).
package com.juan.nino.moviesrappiapp.ui.view.search;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SearchMovieActivity_MembersInjector
    implements MembersInjector<SearchMovieActivity> {
  private final Provider<ViewModelProvider.Factory> vmFactoryProvider;

  public SearchMovieActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> vmFactoryProvider) {
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<SearchMovieActivity> create(
      Provider<ViewModelProvider.Factory> vmFactoryProvider) {
    return new SearchMovieActivity_MembersInjector(vmFactoryProvider);
  }

  @Override
  public void injectMembers(SearchMovieActivity instance) {
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  public static void injectVmFactory(
      SearchMovieActivity instance, ViewModelProvider.Factory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}