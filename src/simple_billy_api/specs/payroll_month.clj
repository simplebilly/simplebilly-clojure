(ns simple-billy-api.specs.payroll-month
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payroll-month-data
  {
   (ds/req :gross) string?
   (ds/req :month) int?
   (ds/req :net) string?
   })

(def payroll-month-spec
  (ds/spec
    {:name ::payroll-month
     :spec payroll-month-data}))
