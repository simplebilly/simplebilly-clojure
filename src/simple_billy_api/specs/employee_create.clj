(ns simple-billy-api.specs.employee-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.country-code :refer :all]
            [simple-billy-api.specs.gender :refer :all]
            [simple-billy-api.specs.employee-status :refer :all]
            )
  (:import (java.io File)))


(def employee-create-data
  {
   (ds/opt :address) string?
   (ds/opt :backupEmployeeId) uuid?
   (ds/opt :bic) string?
   (ds/opt :city) string?
   (ds/opt :country) country-code-spec
   (ds/opt :dateOfBirth) inst?
   (ds/opt :departmentId) uuid?
   (ds/opt :email) string?
   (ds/opt :firstName) string?
   (ds/opt :gender) gender-spec
   (ds/opt :hireDate) inst?
   (ds/opt :hourlyCost) string?
   (ds/opt :iban) string?
   (ds/opt :jobTitle) string?
   (ds/opt :lastLogin) inst?
   (ds/opt :lastName) string?
   (ds/opt :lastUpdated) inst?
   (ds/opt :monthlySalary) string?
   (ds/opt :phone) string?
   (ds/opt :state) string?
   (ds/opt :status) employee-status-spec
   (ds/opt :userId) uuid?
   (ds/opt :weeklyHours) string?
   (ds/opt :zip) string?
   })

(def employee-create-spec
  (ds/spec
    {:name ::employee-create
     :spec employee-create-data}))
