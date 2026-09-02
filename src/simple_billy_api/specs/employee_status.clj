(ns simple-billy-api.specs.employee-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def employee-status-data
  {
   })

(def employee-status-spec
  (ds/spec
    {:name ::employee-status
     :spec employee-status-data}))
