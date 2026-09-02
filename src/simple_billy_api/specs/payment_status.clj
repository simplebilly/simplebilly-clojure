(ns simple-billy-api.specs.payment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payment-status-data
  {
   })

(def payment-status-spec
  (ds/spec
    {:name ::payment-status
     :spec payment-status-data}))
