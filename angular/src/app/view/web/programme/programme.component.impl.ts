// Generated by andromda-angular cartridge (view\view.component.imp.ts.vsl) CAN EDIT!
import { Component, Injector } from '@angular/core';
import { ProgrammeComponent } from '@app/view/web/programme/programme.component';
import { ProgrammeEditForm } from '@app/view/web/programme/programme.component';
import { ProgrammeSearchForm } from '@app/view/web/programme/programme.component';
import { ProgrammeDeleteForm } from '@app/view/web/programme/programme.component';
import { ProgrammeVarsForm } from '@app/view/web/programme/programme.component';

@Component({
  selector: 'programme',
  templateUrl: './programme.component.html',
  styleUrls: ['./programme.component.scss'],
})
export class ProgrammeComponentImpl extends ProgrammeComponent {
  constructor(private injector: Injector) {
    super(injector);
  }

  beforeOnInit() {}

  afterOnInit() {}

  doNgAfterViewInit() {}

  handleFormChanges(change: any) {}

  afterSetProgrammeEditForm(form: ProgrammeEditForm): void {}

  afterProgrammeEdit(form: ProgrammeEditForm) {}

  beforeProgrammeEdit(form: ProgrammeEditForm) {}

  afterSetProgrammeSearchForm(form: ProgrammeSearchForm): void {}

  afterProgrammeSearch(form: ProgrammeSearchForm) {}

  beforeProgrammeSearch(form: ProgrammeSearchForm) {}

  afterSetProgrammeDeleteForm(form: ProgrammeDeleteForm): void {}

  afterProgrammeDelete(form: ProgrammeDeleteForm) {}

  beforeProgrammeDelete(form: ProgrammeDeleteForm) {}

  afterSetProgrammeVarsForm(form: ProgrammeVarsForm): void {}
}
