(ns simple-billy-api.specs.public-posting
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def public-posting-data
  {
   (ds/opt :currency) string?
   (ds/req :description) string?
   (ds/opt :employmentType) string?
   (ds/req :id) uuid?
   (ds/opt :location) string?
   (ds/req :remote) boolean?
   (ds/req :requiredSkills) (s/coll-of string?)
   (ds/opt :requirements) string?
   (ds/opt :salaryMax) int?
   (ds/opt :salaryMin) int?
   (ds/req :title) string?
   })

(def public-posting-spec
  (ds/spec
    {:name ::public-posting
     :spec public-posting-data}))
