(ns simple-billy-api.specs.employee
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.country-code :refer :all]
            [simple-billy-api.specs.gender :refer :all]
            [simple-billy-api.specs.employee-status :refer :all]
            )
  (:import (java.io File)))


(def employee-data
  {
   (ds/opt :address) string?
   (ds/opt :backupEmployeeId) uuid?
   (ds/opt :bic) string?
   (ds/opt :city) string?
   (ds/opt :country) country-code-spec
   (ds/opt :createdAt) inst?
   (ds/opt :dateOfBirth) inst?
   (ds/opt :deletedAt) inst?
   (ds/opt :departmentId) uuid?
   (ds/opt :email) string?
   (ds/opt :firstName) string?
   (ds/opt :gender) gender-spec
   (ds/opt :hireDate) inst?
   (ds/opt :hourlyCost) string?
   (ds/opt :iban) string?
   (ds/opt :id) uuid?
   (ds/opt :jobTitle) string?
   (ds/opt :lastLogin) inst?
   (ds/opt :lastName) string?
   (ds/opt :lastUpdated) inst?
   (ds/opt :monthlySalary) string?
   (ds/opt :phone) string?
   (ds/opt :state) string?
   (ds/opt :status) employee-status-spec
   (ds/opt :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   (ds/opt :userId) uuid?
   (ds/opt :weeklyHours) string?
   (ds/opt :zip) string?
   })

(def employee-spec
  (ds/spec
    {:name ::employee
     :spec employee-data}))
