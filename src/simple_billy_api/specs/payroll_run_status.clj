(ns simple-billy-api.specs.payroll-run-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payroll-run-status-data
  {
   })

(def payroll-run-status-spec
  (ds/spec
    {:name ::payroll-run-status
     :spec payroll-run-status-data}))
