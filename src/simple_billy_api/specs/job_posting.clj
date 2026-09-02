(ns simple-billy-api.specs.job-posting
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.employment-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.job-posting-status :refer :all]
            )
  (:import (java.io File)))


(def job-posting-data
  {
   (ds/opt :currency) string?
   (ds/opt :department) string?
   (ds/req :description) string?
   (ds/opt :employmentType) employment-type-spec
   (ds/opt :location) string?
   (ds/req :remote) boolean?
   (ds/req :requiredSkills) any-type-spec
   (ds/opt :requirements) string?
   (ds/opt :salaryMax) int?
   (ds/opt :salaryMin) int?
   (ds/req :status) job-posting-status-spec
   (ds/req :title) string?
   })

(def job-posting-spec
  (ds/spec
    {:name ::job-posting
     :spec job-posting-data}))
