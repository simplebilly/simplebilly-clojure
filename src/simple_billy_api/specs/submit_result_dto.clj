(ns simple-billy-api.specs.submit-result-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def submit-result-dto-data
  {
   (ds/req :answers) (s/coll-of int?)
   (ds/opt :assignmentId) uuid?
   (ds/req :score) int?
   (ds/req :trainingCode) string?
   })

(def submit-result-dto-spec
  (ds/spec
    {:name ::submit-result-dto
     :spec submit-result-dto-data}))
