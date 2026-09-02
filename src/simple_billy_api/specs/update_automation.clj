(ns simple-billy-api.specs.update-automation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def update-automation-data
  {
   (ds/opt :config) any-type-spec
   (ds/opt :enabled) boolean?
   })

(def update-automation-spec
  (ds/spec
    {:name ::update-automation
     :spec update-automation-data}))
