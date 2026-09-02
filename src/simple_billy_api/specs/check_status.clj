(ns simple-billy-api.specs.check-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def check-status-data
  {
   })

(def check-status-spec
  (ds/spec
    {:name ::check-status
     :spec check-status-data}))
