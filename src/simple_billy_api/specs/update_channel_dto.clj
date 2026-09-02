(ns simple-billy-api.specs.update-channel-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def update-channel-dto-data
  {
   (ds/opt :config) any-type-spec
   (ds/opt :is_active) boolean?
   (ds/opt :name) string?
   })

(def update-channel-dto-spec
  (ds/spec
    {:name ::update-channel-dto
     :spec update-channel-dto-data}))
