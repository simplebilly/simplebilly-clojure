(ns simple-billy-api.specs.rfq-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def rfq-status-data
  {
   })

(def rfq-status-spec
  (ds/spec
    {:name ::rfq-status
     :spec rfq-status-data}))
