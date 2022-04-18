Feature: Page Penilaian HRIS - PA Employee Downliner
  
  @PenilaianKosong
  Scenario: User tidak dapat mengisi penilaian
    When User klik tombol Action
    Then User kembali ke halaman sebelumnya
   
  
  @PenilaianBerhasil
  Scenario: User dapat mengisi penilaian
  	When User klik button action
  	Then User mengisi penilaian
  	Then User berhasil memberi nilai
