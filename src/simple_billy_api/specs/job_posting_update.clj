(ns simple-billy-api.specs.job-posting-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.employment-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.job-posting-status :refer :all]
            )
  (:import (java.io File)))


(def job-posting-update-data
  {
   (ds/opt :currency) string?
   (ds/opt :department) string?
   (ds/opt :description) string?
   (ds/opt :employmentType) employment-type-spec
   (ds/opt :location) string?
   (ds/opt :remote) boolean?
   (ds/opt :requiredSkills) any-type-spec
   (ds/opt :requirements) string?
   (ds/opt :salaryMax) int?
   (ds/opt :salaryMin) int?
   (ds/opt :status) job-posting-status-spec
   (ds/opt :title) string?
   })

(def job-posting-update-spec
  (ds/spec
    {:name ::job-posting-update
     :spec job-posting-update-data}))
