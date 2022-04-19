Feature: Menu PA360 - Performance Appraisal

	@TestMenu
  Scenario: Testing Menu PA360
    When User klik menu PA360
    Then Menampilkan data PA360
	#Scenario: Testing Show Range Data PA360
		When User klik Show Entries
		Then Menampilkan data PA360 sesuai banyaknya data yang dipilih
	#Scenario: Testing Sorting Data PA360
		When User klik sorting pada Tabel Detail
		Then Menampilkan data PA360 secara ascending	
	#Scenario: Testing Search Data PA360
		When User search data
		Then Menampilkan data yang dicari