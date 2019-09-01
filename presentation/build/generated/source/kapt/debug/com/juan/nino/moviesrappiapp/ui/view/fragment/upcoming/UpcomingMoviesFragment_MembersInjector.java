// Generated by Dagger (https://google.github.io/dagger).
package com.juan.nino.moviesrappiapp.ui.view.fragment.upcoming;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class UpcomingMoviesFragment_MembersInjector
    implements MembersInjector<UpcomingMoviesFragment> {
  private final Provider<ViewModelProvider.Factory> vmFactoryProvider;

  public UpcomingMoviesFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> vmFactoryProvider) {
    this.vmFactoryProvider = vmFactoryProvider;
  }

  public static MembersInjector<UpcomingMoviesFragment> create(
      Provider<ViewModelProvider.Factory> vmFactoryProvider) {
    return new UpcomingMoviesFragment_MembersInjector(vmFactoryProvider);
  }

  @Override
  public void injectMembers(UpcomingMoviesFragment instance) {
    injectVmFactory(instance, vmFactoryProvider.get());
  }

  public static void injectVmFactory(
      UpcomingMoviesFragment instance, ViewModelProvider.Factory vmFactory) {
    instance.vmFactory = vmFactory;
  }
}